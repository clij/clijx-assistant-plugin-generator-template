package net.haesleinhuepf.clijx;


import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.coremem.enums.NativeTypeEnum;
import net.haesleinhuepf.clij.macro.CLIJMacroPlugin;
import net.haesleinhuepf.clij.macro.CLIJOpenCLProcessor;
import net.haesleinhuepf.clij.macro.documentation.OffersDocumentation;
import net.haesleinhuepf.clij2.CLIJ2;
import net.haesleinhuepf.clijx.CLIJx;
import net.haesleinhuepf.clijx.utilities.AbstractCLIJxPlugin;
import org.scijava.plugin.Plugin;
/**
 *
 * Author: enter_your_name_here
 *         enter_date_here
 */

@Plugin(type = CLIJMacroPlugin.class, name = "CLIJx_EnterCLIJPluginIdentifierHere")
public class EnterClassNameHere extends AbstractCLIJxPlugin implements CLIJMacroPlugin, CLIJOpenCLProcessor, OffersDocumentation {

    @Override
    public String getParameterHelpText() {
        return "Image input, ByRef Image destination, Enter_Paramaters_Here";
    }

    @Override
    public Object[] getDefaultValues() {
        return new Object[]{null, null, 1/*enter_default_values_here*/};
    }

    @Override
    public boolean executeCL() {
        return enter_function_name_here(getCLIJx(), (ClearCLBuffer) args[0], (ClearCLBuffer) args[1], asFloat(args[2]));
    }

    public static boolean enter_function_name_here(CLIJx clijx, ClearCLBuffer pushed, ClearCLBuffer result, Float enter_typed_parameters_here) {

        // enter_code_here

        return true;
    }

    @Override
    public String getDescription() {
        return "enter_plugin_description_here";
    }

    @Override
    public String getAvailableForDimensions() {
        return "2D, 3D";
    }
}


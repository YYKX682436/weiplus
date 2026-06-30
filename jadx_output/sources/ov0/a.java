package ov0;

/* loaded from: classes5.dex */
public abstract class a extends ov0.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setAnimStyleState$plugin_mj_template_release(sw0.e textMaterialUiState) {
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
        android.view.View stylePageView = getStylePageView();
        vw0.i0 i0Var = stylePageView instanceof vw0.i0 ? (vw0.i0) stylePageView : null;
        if (i0Var != null) {
            i0Var.setAnimStyleState$plugin_mj_template_release(textMaterialUiState);
        }
    }

    public final void setColorStyleState$plugin_mj_template_release(sw0.e textMaterialUiState) {
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
        android.view.View stylePageView = getStylePageView();
        vw0.i0 i0Var = stylePageView instanceof vw0.i0 ? (vw0.i0) stylePageView : null;
        if (i0Var != null) {
            i0Var.setColorStyleState$plugin_mj_template_release(textMaterialUiState);
        }
    }

    public final void setFontStyleState$plugin_mj_template_release(sw0.e textMaterialUiState) {
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
        android.view.View stylePageView = getStylePageView();
        vw0.i0 i0Var = stylePageView instanceof vw0.i0 ? (vw0.i0) stylePageView : null;
        if (i0Var != null) {
            i0Var.setFontStyleState(textMaterialUiState);
        }
    }

    public final void setSelectedCallback$plugin_mj_template_release(vw0.d0 textStyleCallback) {
        kotlin.jvm.internal.o.g(textStyleCallback, "textStyleCallback");
        android.view.View stylePageView = getStylePageView();
        vw0.i0 i0Var = stylePageView instanceof vw0.i0 ? (vw0.i0) stylePageView : null;
        if (i0Var == null) {
            return;
        }
        i0Var.setSelectedTextStyleCallback(textStyleCallback);
    }

    public final void setTextStyleState$plugin_mj_template_release(sw0.e textMaterialUiState) {
        kotlin.jvm.internal.o.g(textMaterialUiState, "textMaterialUiState");
        android.view.View stylePageView = getStylePageView();
        vw0.i0 i0Var = stylePageView instanceof vw0.i0 ? (vw0.i0) stylePageView : null;
        if (i0Var != null) {
            i0Var.setTextStyleState(textMaterialUiState);
        }
    }
}

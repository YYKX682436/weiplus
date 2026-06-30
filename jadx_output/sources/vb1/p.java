package vb1;

/* loaded from: classes13.dex */
public class p extends gb1.d {
    public static final int CTRL_INDEX = 67;
    public static final java.lang.String NAME = "insertCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("canvasId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        android.content.Context context = tVar.getContext();
        com.tencent.mm.plugin.appbrand.canvas.widget.AppBrandDrawableView appBrandDrawableView = new com.tencent.mm.plugin.appbrand.canvas.widget.AppBrandDrawableView(context);
        appBrandDrawableView.getDrawContext().f470716f = (z81.k) tVar.q(z81.k.class);
        appBrandDrawableView.getDrawContext().f470718h = tVar;
        appBrandDrawableView.setContentDescription(context.getString(com.tencent.mm.R.string.f490017il));
        tVar.R(new vb1.n(this, appBrandDrawableView));
        tVar.U(new vb1.o(this, appBrandDrawableView));
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(context, appBrandDrawableView);
    }
}

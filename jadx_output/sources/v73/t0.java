package v73;

/* loaded from: classes.dex */
public class t0 implements yz5.l {
    public t0(v73.v0 v0Var) {
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        return ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h2o)).getText() + ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h2t)).getText() + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fwg, ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h2r)).getText()) + ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h2s)).getText();
    }
}

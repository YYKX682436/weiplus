package v73;

/* loaded from: classes.dex */
public class o implements yz5.l {
    public o(v73.n nVar) {
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        return ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h2k)).getText() + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fwh, ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h2i)).getText());
    }
}

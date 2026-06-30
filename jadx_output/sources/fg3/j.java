package fg3;

/* loaded from: classes12.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.o f262435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fg3.o oVar) {
        super(2);
        this.f262435d = oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        fg3.o oVar = this.f262435d;
        if (str == null || str2 == null) {
            oVar.a0().a().setVisibility(8);
        } else {
            oVar.a0().a().setVisibility(0);
            em.s1 a07 = oVar.a0();
            if (a07.f254777f == null) {
                a07.f254777f = (android.widget.TextView) a07.f254772a.findViewById(com.tencent.mm.R.id.vht);
            }
            a07.f254777f.setText(str);
            em.s1 a08 = oVar.a0();
            if (a08.f254774c == null) {
                a08.f254774c = (android.widget.TextView) a08.f254772a.findViewById(com.tencent.mm.R.id.vhu);
            }
            a08.f254774c.setText(str2);
        }
        return jz5.f0.f302826a;
    }
}

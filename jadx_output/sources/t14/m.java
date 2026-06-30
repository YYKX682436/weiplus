package t14;

/* loaded from: classes11.dex */
public final class m implements com.tencent.mm.ui.base.preference.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t14.q f414583a;

    public m(t14.q qVar) {
        this.f414583a = qVar;
    }

    @Override // com.tencent.mm.ui.base.preference.g0
    public final void a(android.view.View view, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String mj6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).mj(view);
        java.lang.String str = preference.f197780q;
        if (mj6 == null || r26.n0.N(mj6)) {
            mj6 = str;
        }
        java.util.Map U6 = this.f414583a.U6(preference);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, mj6);
        aVar.tk(view, mj6);
        ((cy1.a) aVar.ik(view, 32, 33328)).gk(view, U6);
    }
}

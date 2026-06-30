package fe2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.h f261504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fe2.h hVar) {
        super(0);
        this.f261504d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fe2.h hVar = this.f261504d;
        de2.h t17 = hVar.t1();
        de2.f[] fVarArr = de2.f.f229376d;
        t17.getClass();
        java.lang.Object[] objArr = {t17.f229385f};
        android.content.Context context = t17.f229380a;
        t17.f229382c.setText(context.getString(com.tencent.mm.R.string.dg9, objArr));
        t17.f229383d.setText(context.getString(com.tencent.mm.R.string.dg6));
        wd2.g gVar = t17.f229384e;
        gVar.b(4);
        gVar.f(0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_BOX_HINT_INT_SYNC, 1);
        wd2.g gVar2 = hVar.t1().f229384e;
        fe2.a aVar = new fe2.a(hVar);
        gVar2.getClass();
        gVar2.f444852s = aVar;
        return jz5.f0.f302826a;
    }
}

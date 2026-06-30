package o73;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o73.j f343548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o73.j jVar, java.lang.String str) {
        super(0);
        this.f343548d = jVar;
        this.f343549e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        o73.j jVar = this.f343548d;
        java.lang.String str = this.f343549e;
        if (o73.j.Y6(jVar, str) == null) {
            o73.b bVar = new o73.b();
            bVar.field_UserName = str;
            bVar.field_HashUserName = jVar.X6(str, jVar.a7());
            bVar.field_CommHashUserName = jVar.X6(str, jVar.Z6());
            bVar.field_HardCodeHashUserName = jVar.X6(str, jVar.b7());
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage.V6(this.f343548d, bVar, false, false, 6, null);
        }
        return jz5.f0.f302826a;
    }
}

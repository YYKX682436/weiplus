package qy0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager f367587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager) {
        super(2);
        this.f367587d = mMMusicManager;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager = this.f367587d;
        if (booleanValue) {
            gz0.h hVar = mMMusicManager.f69748m;
            if (hVar != null) {
                hVar.a();
            }
        } else {
            gz0.h hVar2 = mMMusicManager.f69748m;
            if (hVar2 != null) {
                hVar2.b();
            }
        }
        ((n0.q4) mMMusicManager.f69746h).setValue(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}

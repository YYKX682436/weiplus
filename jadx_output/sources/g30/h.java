package g30;

@j95.b
/* loaded from: classes9.dex */
public class h extends i95.w implements k12.s {

    /* renamed from: d, reason: collision with root package name */
    public final s25.b[] f268042d = {null};

    public com.tencent.mm.storage.n5 Ai() {
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        return com.tencent.mm.storage.n5.f();
    }

    public s25.b Bi() {
        s25.b[] bVarArr = this.f268042d;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                s25.b[] bVarArr2 = this.f268042d;
                if (bVarArr2[0] == null) {
                    bVarArr2[0] = new h65.c();
                }
            }
        }
        return this.f268042d[0];
    }

    public s25.a wi() {
        return ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni();
    }
}

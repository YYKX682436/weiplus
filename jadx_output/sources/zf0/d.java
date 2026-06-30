package zf0;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f472393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.f0 f0Var, java.lang.String str) {
        super(1);
        this.f472393d = f0Var;
        this.f472394e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        t21.v2 update = (t21.v2) obj;
        kotlin.jvm.internal.o.g(update, "$this$update");
        update.f415015m = this.f472393d.f310116d;
        update.U |= 4096;
        update.f415010h = (int) com.tencent.mm.vfs.w6.k(this.f472394e);
        update.U |= 128;
        return jz5.f0.f302826a;
    }
}

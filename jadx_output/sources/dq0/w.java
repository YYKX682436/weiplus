package dq0;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.l lVar) {
        super(1);
        this.f242340d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse resp = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f242340d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(resp)));
        return jz5.f0.f302826a;
    }
}

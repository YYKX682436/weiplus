package ot0;

/* loaded from: classes12.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f348808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f348809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(long j17, long j18) {
        super(0);
        this.f348808d = j17;
        this.f348809e = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.Expression and = field.gt(this.f348808d).and(field.lt(this.f348809e));
        kotlin.jvm.internal.o.f(and, "and(...)");
        return and;
    }
}

package ot0;

/* loaded from: classes12.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f348816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f348817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(long j17, long j18) {
        super(0);
        this.f348816d = j17;
        this.f348817e = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.wcdb.orm.Field field = up5.i.f429977i;
        com.tencent.wcdb.winq.Expression and = field.ge(this.f348816d).and(field.le(this.f348817e));
        kotlin.jvm.internal.o.f(and, "and(...)");
        return and;
    }
}

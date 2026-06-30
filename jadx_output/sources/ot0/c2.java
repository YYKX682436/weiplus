package ot0;

/* loaded from: classes12.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.lang.String str) {
        super(0);
        this.f348436d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.wcdb.orm.Field field = up5.i.f429979k;
        java.lang.String str = this.f348436d;
        if (str == null) {
            str = "";
        }
        com.tencent.wcdb.winq.Expression like = field.like(str);
        kotlin.jvm.internal.o.f(like, "like(...)");
        return like;
    }
}

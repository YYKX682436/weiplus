package o73;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f343542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, java.lang.String str) {
        super(1);
        this.f343542d = i17;
        this.f343543e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o73.b it = (o73.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = this.f343542d;
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(i17 != 1 ? i17 != 3 ? it.field_CommHashUserName : it.field_HardCodeHashUserName : it.field_HashUserName, this.f343543e));
    }
}

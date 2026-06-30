package la5;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f317640d = str;
        this.f317641e = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (kotlin.jvm.internal.o.b(it.getTag(com.tencent.mm.R.id.nwr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.actionbar_icon_dark_close)) || kotlin.jvm.internal.o.b(it.getTag(com.tencent.mm.R.id.nwr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.actionbar_icon_light_close))) {
            return this.f317640d;
        }
        if (!kotlin.jvm.internal.o.b(it.getTag(com.tencent.mm.R.id.nwr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.actionbar_icon_dark_back))) {
            kotlin.jvm.internal.o.b(it.getTag(com.tencent.mm.R.id.nwr), java.lang.Integer.valueOf(com.tencent.mm.R.raw.actionbar_icon_light_back));
        }
        return this.f317641e;
    }
}

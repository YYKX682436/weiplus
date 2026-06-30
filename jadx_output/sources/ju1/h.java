package ju1;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f301722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, int i17) {
        super(0);
        this.f301721d = context;
        this.f301722e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f301721d;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setGravity(17);
        int i17 = this.f301722e;
        if (i17 == 1 || i17 == 5) {
            textView.setTextColor(i65.a.d(context, com.tencent.mm.R.color.FG_1));
        } else {
            textView.setTextColor(-1);
        }
        return textView;
    }
}

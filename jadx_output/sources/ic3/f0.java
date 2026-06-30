package ic3;

/* loaded from: classes5.dex */
public final class f0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f290401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context, java.lang.String title, java.lang.String aid) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(aid, "aid");
        this.f290401d = aid;
        xj.n nVar = new xj.n(null, null, null, kz5.c1.k(new jz5.l("number", 123), new jz5.l("string", "hello"), new jz5.l(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN, java.lang.Boolean.TRUE)), 7, null);
        android.widget.Button button = new android.widget.Button(context);
        button.setText(title);
        button.setOnClickListener(new ic3.d0(this, nVar));
        addView(button);
        addOnAttachStateChangeListener(new ic3.e0(this));
    }
}

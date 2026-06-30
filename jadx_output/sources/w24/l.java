package w24;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f442627a;

    /* renamed from: b, reason: collision with root package name */
    public w24.d f442628b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f442629c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f442630d;

    public l(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f442627a = key;
    }

    public final android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View view = this.f442629c;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.clf, (android.view.ViewGroup) null, false);
            this.f442629c = view;
        }
        kotlin.jvm.internal.o.d(view);
        w24.w wVar = (w24.w) this;
        wVar.f442644f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nu6);
        wVar.f442645g = (com.tencent.mm.ui.widget.MMSwitchBtn) view.findViewById(com.tencent.mm.R.id.ntt);
        wVar.c();
        return view;
    }
}

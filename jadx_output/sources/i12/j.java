package i12;

/* loaded from: classes14.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f287216a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f287217b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f287218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.k f287219d;

    public j(i12.k kVar, android.view.View view) {
        this.f287219d = kVar;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.def);
        this.f287217b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ded);
        this.f287218c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dee);
        this.f287216a = view.findViewById(com.tencent.mm.R.id.dbr);
        view.setAccessibilityDelegate(new i12.h(this, kVar));
        imageView.setAccessibilityDelegate(new i12.i(this, kVar));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = kVar.f287220d;
            view.setLayoutParams(layoutParams);
        }
    }
}

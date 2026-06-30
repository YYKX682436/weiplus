package e33;

/* loaded from: classes10.dex */
public class v5 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f247518d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f247519e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f247520f;

    public v5(android.view.View view, int i17) {
        super(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f482843ph);
        this.f247518d = imageView;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i17;
        imageView.setLayoutParams(layoutParams);
        this.f247519e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482880qm);
        this.f247520f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482818op);
    }
}

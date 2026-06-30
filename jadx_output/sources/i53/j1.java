package i53;

/* loaded from: classes8.dex */
public class j1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f288609d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f288610e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f288611f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f288612g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.CheckBox f288613h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f288614i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f288615m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f288616n;

    public j1(com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView, android.view.View view) {
        super(view);
        this.f288609d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.je6);
        this.f288610e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.jec);
        this.f288611f = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.ozf);
        this.f288612g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ozh);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.jdh);
        this.f288613h = checkBox;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.jdi);
        this.f288614i = findViewById;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485869je0);
        this.f288615m = imageView;
        findViewById.setTag(com.tencent.mm.R.id.jdh, checkBox);
        findViewById.setTag(com.tencent.mm.R.id.f485869je0, imageView);
        this.f288616n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.d6i);
    }
}

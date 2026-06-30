package k53;

/* loaded from: classes8.dex */
public class b0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f304337d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.media.preview.GameVideoView f304338e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f304339f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f304340g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ProgressBar f304341h;

    public b0(k53.c0 c0Var, android.view.View view) {
        super(view);
        this.f304337d = view;
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = (com.tencent.mm.plugin.game.media.preview.GameVideoView) view.findViewById(com.tencent.mm.R.id.p0x);
        this.f304338e = gameVideoView;
        gameVideoView.setVideoFooterView(new k53.k0(c0Var.f304347e.f140114d));
        this.f304339f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.o6z);
        this.f304340g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.oyi);
        this.f304341h = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ozc);
    }
}

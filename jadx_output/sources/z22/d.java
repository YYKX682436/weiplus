package z22;

/* loaded from: classes10.dex */
public final class d extends z22.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f469714d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f469715e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame f469716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z22.f fVar, android.view.View itemView) {
        super(fVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f469714d = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.da9);
        this.f469715e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.da_);
        this.f469716f = (com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame) itemView.findViewById(com.tencent.mm.R.id.dae);
        itemView.setOnClickListener(new z22.c(this, fVar));
    }

    @Override // z22.a
    public void i(int i17, r45.p64 info) {
        kotlin.jvm.internal.o.g(info, "info");
        vo0.d dVar = u85.p.f425721a;
        wo0.c a17 = u85.p.f425721a.a(new u85.a(info));
        android.widget.ImageView imageView = this.f469714d;
        kotlin.jvm.internal.o.d(imageView);
        a17.c(imageView);
        this.f469715e.setText(info.f382794f);
        this.f469716f.a(info.f382792d);
    }
}

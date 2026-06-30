package ub4;

/* loaded from: classes4.dex */
public class n extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.QDisFadeImageView f426189d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f426190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ub4.p f426191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ub4.p pVar, android.view.View view) {
        super(view);
        this.f426191f = pVar;
        this.f426189d = null;
        this.f426190e = null;
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView = (com.tencent.mm.ui.widget.QDisFadeImageView) view.findViewById(com.tencent.mm.R.id.n6_);
        this.f426189d = qDisFadeImageView;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n6a);
        this.f426190e = imageView;
        imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.shortvideo_play_btn));
        qDisFadeImageView.setScaleType(al5.q2.CENTER_CROP);
        qDisFadeImageView.setOnClickListener(new ub4.m(this, pVar));
    }
}

package jf2;

/* loaded from: classes3.dex */
public final class a extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f299351d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f299352e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f299353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View mItemView) {
        super(mItemView);
        kotlin.jvm.internal.o.g(mItemView, "mItemView");
        this.f299351d = mItemView;
        this.f299352e = (com.tencent.mm.ui.widget.imageview.WeImageView) mItemView.findViewById(com.tencent.mm.R.id.rpu);
        this.f299353f = (android.widget.TextView) mItemView.findViewById(com.tencent.mm.R.id.rpx);
    }
}

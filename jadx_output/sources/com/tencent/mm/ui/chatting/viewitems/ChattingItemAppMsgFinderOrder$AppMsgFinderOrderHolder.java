package com.tencent.mm.ui.chatting.viewitems;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\n\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010*\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000f¨\u0006/"}, d2 = {"com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder", "Lcom/tencent/mm/ui/chatting/viewitems/g0;", "Landroid/view/View;", "view", "", "isSend", "Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder;", "build", "getMainContainerView", "Landroid/widget/ImageView;", "coverIv", "Landroid/widget/ImageView;", "getCoverIv", "()Landroid/widget/ImageView;", "setCoverIv", "(Landroid/widget/ImageView;)V", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "titleTv", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "getTitleTv", "()Lcom/tencent/mm/ui/widget/MMNeat7extView;", "setTitleTv", "(Lcom/tencent/mm/ui/widget/MMNeat7extView;)V", "Landroid/widget/TextView;", "stateTv", "Landroid/widget/TextView;", "getStateTv", "()Landroid/widget/TextView;", "setStateTv", "(Landroid/widget/TextView;)V", "descTv", "getDescTv", "setDescTv", "detailLayout", "Landroid/view/View;", "getDetailLayout", "()Landroid/view/View;", "setDetailLayout", "(Landroid/view/View;)V", "divider", "getDivider", "setDivider", "tickIV", "getTickIV", "setTickIV", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder extends com.tencent.mm.ui.chatting.viewitems.g0 {
    public static final int $stable = 8;
    private android.widget.ImageView coverIv;
    private android.widget.TextView descTv;
    private android.view.View detailLayout;
    private android.view.View divider;
    private android.widget.TextView stateTv;
    private android.widget.ImageView tickIV;
    private com.tencent.mm.ui.widget.MMNeat7extView titleTv;

    public final com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder build(android.view.View view, boolean isSend) {
        kotlin.jvm.internal.o.g(view, "view");
        super.create(view);
        this.detailLayout = view.findViewById(com.tencent.mm.R.id.bjy);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.brc);
        android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
        if (textView != null) {
            this.userTV = textView;
        }
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        this.uploadingPB = progressBar;
        if (isSend) {
            this.tickIV = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
        } else if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.titleTv = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.bnw);
        this.descTv = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bnu);
        this.stateTv = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bnv);
        this.coverIv = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bns);
        this.divider = view.findViewById(com.tencent.mm.R.id.bnr);
        return this;
    }

    public final android.widget.ImageView getCoverIv() {
        return this.coverIv;
    }

    public final android.widget.TextView getDescTv() {
        return this.descTv;
    }

    public final android.view.View getDetailLayout() {
        return this.detailLayout;
    }

    public final android.view.View getDivider() {
        return this.divider;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.detailLayout;
    }

    public final android.widget.TextView getStateTv() {
        return this.stateTv;
    }

    public final android.widget.ImageView getTickIV() {
        return this.tickIV;
    }

    public final com.tencent.mm.ui.widget.MMNeat7extView getTitleTv() {
        return this.titleTv;
    }

    public final void setCoverIv(android.widget.ImageView imageView) {
        this.coverIv = imageView;
    }

    public final void setDescTv(android.widget.TextView textView) {
        this.descTv = textView;
    }

    public final void setDetailLayout(android.view.View view) {
        this.detailLayout = view;
    }

    public final void setDivider(android.view.View view) {
        this.divider = view;
    }

    public final void setStateTv(android.widget.TextView textView) {
        this.stateTv = textView;
    }

    public final void setTickIV(android.widget.ImageView imageView) {
        this.tickIV = imageView;
    }

    public final void setTitleTv(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView) {
        this.titleTv = mMNeat7extView;
    }
}

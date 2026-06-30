package kp4;

/* loaded from: classes10.dex */
public final class o extends kp4.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kp4.r rVar, android.view.View itemView) {
        super(rVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        itemView.setOnClickListener(null);
    }

    @Override // kp4.n
    public void i(kp4.a trackInfo) {
        kotlin.jvm.internal.o.g(trackInfo, "trackInfo");
        android.view.ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams == null) {
            this.itemView.setLayoutParams(new android.view.ViewGroup.LayoutParams(trackInfo.f311073c, -1));
            return;
        }
        int i17 = layoutParams.width;
        int i18 = trackInfo.f311073c;
        if (i17 != i18) {
            layoutParams.width = i18;
            this.itemView.setLayoutParams(layoutParams);
        }
    }
}

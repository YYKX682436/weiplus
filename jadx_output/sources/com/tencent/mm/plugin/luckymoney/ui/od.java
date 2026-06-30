package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class od implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f147274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.qd f147275e;

    public od(boolean z17, com.tencent.mm.plugin.luckymoney.ui.qd qdVar) {
        this.f147274d = z17;
        this.f147275e = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f147274d) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.qd qdVar = this.f147275e;
        android.widget.ImageView imageView = (android.widget.ImageView) qdVar.findViewById(com.tencent.mm.R.id.udz);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) qdVar.findViewById(com.tencent.mm.R.id.f485779ue0);
        if (imageView2 != null) {
            imageView2.setImageBitmap(null);
        }
    }
}

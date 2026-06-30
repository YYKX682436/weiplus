package com.tencent.mm.plugin.game.luggage.liteapp.ui;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f139844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f139845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f139847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f139848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.liteapp.ui.e f139849i;

    public k(com.tencent.mm.plugin.game.luggage.liteapp.ui.e eVar, boolean z17, android.graphics.Bitmap bitmap, java.lang.String str, int i17, boolean z18) {
        this.f139849i = eVar;
        this.f139844d = z17;
        this.f139845e = bitmap;
        this.f139846f = str;
        this.f139847g = i17;
        this.f139848h = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.tencent.mm.plugin.game.luggage.liteapp.ui.e eVar = this.f139849i;
        if (eVar == null) {
            return;
        }
        final boolean z17 = true;
        if (this.f139844d) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.luggage.liteapp.ui.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    android.widget.LinearLayout linearLayout = com.tencent.mm.plugin.game.luggage.liteapp.ui.e.this.f139825m;
                    if (linearLayout == null) {
                        return;
                    }
                    if (z17) {
                        linearLayout.setVisibility(8);
                    } else {
                        linearLayout.setVisibility(0);
                    }
                }
            });
            return;
        }
        final boolean z18 = false;
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.luggage.liteapp.ui.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.widget.LinearLayout linearLayout = com.tencent.mm.plugin.game.luggage.liteapp.ui.e.this.f139825m;
                if (linearLayout == null) {
                    return;
                }
                if (z18) {
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                }
            }
        });
        if (eVar.f139826n == null || eVar.f139827o == null) {
            return;
        }
        eVar.f139830r = false;
        android.graphics.Bitmap bitmap = this.f139845e;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.String str = this.f139846f;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                eVar.f139826n.setVisibility(8);
                eVar.f139827o.setVisibility(0);
                eVar.f139827o.setText(str);
                int i17 = this.f139847g;
                if (i17 != -1) {
                    eVar.f139827o.setTextColor(i17);
                }
            }
        } else {
            eVar.f139826n.setVisibility(0);
            eVar.f139826n.setImageBitmap(bitmap);
            eVar.f139827o.setVisibility(8);
            eVar.f139830r = true;
        }
        if (this.f139848h) {
            eVar.f139826n.setOnClickListener(eVar.f139836x);
            eVar.f139827o.setOnClickListener(eVar.f139836x);
        }
    }
}

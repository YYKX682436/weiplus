package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class tl implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.ul f147468a;

    public tl(com.tencent.mm.plugin.luckymoney.ui.ul ulVar) {
        this.f147468a = ulVar;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        this.f147468a.f147513b.finish();
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
    }
}

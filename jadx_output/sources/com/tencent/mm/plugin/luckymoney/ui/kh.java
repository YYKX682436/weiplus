package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class kh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.mh f147107d;

    public kh(com.tencent.mm.plugin.luckymoney.ui.mh mhVar) {
        this.f147107d = mhVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.mh mhVar = this.f147107d;
        db5.t7.i(mhVar.f147191f.f147242a.getContext(), mhVar.f147191f.f147242a.getContext().getResources().getString(com.tencent.mm.R.string.goc), com.tencent.mm.R.raw.voice_to_short);
    }
}

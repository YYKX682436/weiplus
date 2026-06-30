package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class v4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f151487d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.g0 f151488e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f151489f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.g0 f151490g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList f151491h;

    /* renamed from: i, reason: collision with root package name */
    public final xm3.t0 f151492i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f151493m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f151494n;

    /* renamed from: o, reason: collision with root package name */
    public gm3.f f151495o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.q4 f151496p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f151497q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f151498r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f151499s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
        this.f151487d = j0Var;
        this.f151488e = j0Var;
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0();
        this.f151489f = j0Var2;
        this.f151490g = j0Var2;
        com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList = new com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList(new com.tencent.mm.plugin.mv.ui.uic.m4(), new xm3.n0(), activity);
        this.f151491h = musicMvFlexLiveList;
        this.f151492i = new xm3.t0(musicMvFlexLiveList, new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFlexEditUIC$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new gm3.h(com.tencent.mm.plugin.mv.ui.uic.v4.this.f151496p);
            }
        }, false);
        this.f151493m = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.n4(this));
        this.f151494n = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.p4(this));
        this.f151496p = new com.tencent.mm.plugin.mv.ui.uic.q4(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r45.ss4 O6(com.tencent.mm.plugin.mv.ui.uic.v4 r21, r45.ss4 r22, java.util.List r23, java.util.HashMap r24) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.v4.O6(com.tencent.mm.plugin.mv.ui.uic.v4, r45.ss4, java.util.List, java.util.HashMap):r45.ss4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x019f, code lost:
    
        if (r10.f380364e == 2) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r29, int r30, android.content.Intent r31) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.v4.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.c3 c3Var = (com.tencent.mm.plugin.mv.ui.uic.c3) a17;
        java.lang.Integer num = (java.lang.Integer) c3Var.O6().getValue();
        if (num == null || num.intValue() != 1) {
            return false;
        }
        this.f151491h.d(new com.tencent.mm.plugin.mv.ui.uic.u4(c3Var, this));
        return true;
    }
}

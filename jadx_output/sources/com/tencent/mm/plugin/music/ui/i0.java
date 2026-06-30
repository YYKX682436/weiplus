package com.tencent.mm.plugin.music.ui;

/* loaded from: classes10.dex */
public class i0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f150750c;

    public i0(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI, java.lang.String str, java.lang.String str2, int i17) {
        this.f150748a = str;
        this.f150749b = str2;
        this.f150750c = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        ll3.j2.g(this.f150748a, this.f150749b, this.f150750c);
    }
}

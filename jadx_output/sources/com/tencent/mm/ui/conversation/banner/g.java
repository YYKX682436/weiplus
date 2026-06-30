package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final p35.b f207506a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.drawable.Drawable f207507b;

    public g(p35.b bVar) {
        this.f207506a = bVar;
    }

    public int a(com.tencent.mm.ui.conversation.banner.h hVar) {
        iz5.a.g(null, hVar != null);
        iz5.a.g(null, hVar.f207510b != null);
        android.graphics.drawable.Drawable drawable = this.f207507b;
        if (drawable == null) {
            return -1;
        }
        hVar.f207509a.setBackgroundDrawable(drawable);
        hVar.f207510b.setVisibility(this.f207506a.f351710d ? 0 : 8);
        return 0;
    }
}

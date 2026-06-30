package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class jk {

    /* renamed from: a, reason: collision with root package name */
    public android.animation.ObjectAnimator f132446a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ik f132447b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.ObjectAnimator f132448c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ik f132449d;

    public final void a(java.lang.String tag, java.lang.String msg) {
        boolean z17;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i(tag.concat("(Debug)"), msg);
        }
    }
}

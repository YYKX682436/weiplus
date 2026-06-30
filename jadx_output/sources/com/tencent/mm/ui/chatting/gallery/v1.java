package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class v1 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f201501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201502b;

    public v1(boolean z17, android.content.Context context) {
        this.f201501a = z17;
        this.f201502b = context;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (this.f201501a && str == null) {
            android.content.Context context = this.f201502b;
            context.getString(com.tencent.mm.R.string.f491159c61, context.getString(com.tencent.mm.R.string.k7a));
        }
    }
}

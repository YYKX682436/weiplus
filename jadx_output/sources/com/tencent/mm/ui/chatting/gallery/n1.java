package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201209d;

    public n1(android.content.Context context) {
        this.f201209d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f201209d;
        db5.t7.i(context, context.getString(com.tencent.mm.R.string.ncn), com.tencent.mm.R.raw.icons_filled_done);
    }
}

package com.tencent.mm.ui.chatting;

@j95.b
/* loaded from: classes9.dex */
public final class fd extends i95.w implements rd0.k1 {
    public void Ai(android.content.Context context, java.lang.String textContent, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(textContent, "textContent");
        com.tencent.mm.ui.chatting.hd.r(context, textContent, com.tencent.mm.ui.chatting.hd.d(i17));
    }

    public void wi(android.content.Context context, com.tencent.mm.storage.f9 f9Var, com.tencent.wework.api.IWWAPI.WWAppType wwAppType) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wwAppType, "wwAppType");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((gk5.m1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(gk5.m1.class)).T6(f9Var, wwAppType);
    }
}

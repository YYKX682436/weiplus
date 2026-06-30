package com.tencent.mm.ui.chatting.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.view.f f202928d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.chatting.view.f[] f202929e;

    static {
        com.tencent.mm.ui.chatting.view.f fVar = new com.tencent.mm.ui.chatting.view.f("RunningSkip", 0);
        com.tencent.mm.ui.chatting.view.f fVar2 = new com.tencent.mm.ui.chatting.view.f("Start", 1);
        com.tencent.mm.ui.chatting.view.f fVar3 = new com.tencent.mm.ui.chatting.view.f("Finish", 2);
        f202928d = fVar3;
        com.tencent.mm.ui.chatting.view.f[] fVarArr = {fVar, fVar2, fVar3};
        f202929e = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.chatting.view.f valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.chatting.view.f) java.lang.Enum.valueOf(com.tencent.mm.ui.chatting.view.f.class, str);
    }

    public static com.tencent.mm.ui.chatting.view.f[] values() {
        return (com.tencent.mm.ui.chatting.view.f[]) f202929e.clone();
    }
}

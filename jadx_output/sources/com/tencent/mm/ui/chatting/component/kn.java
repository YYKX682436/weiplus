package com.tencent.mm.ui.chatting.component;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class kn {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.component.kn f199376d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.component.kn f199377e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.component.kn f199378f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.chatting.component.kn[] f199379g;

    static {
        com.tencent.mm.ui.chatting.component.kn knVar = new com.tencent.mm.ui.chatting.component.kn("BarStatusEmpty", 0);
        f199376d = knVar;
        com.tencent.mm.ui.chatting.component.kn knVar2 = new com.tencent.mm.ui.chatting.component.kn("BarStatusTranslating", 1);
        f199377e = knVar2;
        com.tencent.mm.ui.chatting.component.kn knVar3 = new com.tencent.mm.ui.chatting.component.kn("BarStatusTranslateFinish", 2);
        f199378f = knVar3;
        com.tencent.mm.ui.chatting.component.kn[] knVarArr = {knVar, knVar2, knVar3};
        f199379g = knVarArr;
        rz5.b.a(knVarArr);
    }

    public kn(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.chatting.component.kn valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.chatting.component.kn) java.lang.Enum.valueOf(com.tencent.mm.ui.chatting.component.kn.class, str);
    }

    public static com.tencent.mm.ui.chatting.component.kn[] values() {
        return (com.tencent.mm.ui.chatting.component.kn[]) f199379g.clone();
    }
}

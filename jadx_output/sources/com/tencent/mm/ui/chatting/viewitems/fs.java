package com.tencent.mm.ui.chatting.viewitems;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fs {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.fs[] f203999d;

    static {
        com.tencent.mm.ui.chatting.viewitems.fs[] fsVarArr = {new com.tencent.mm.ui.chatting.viewitems.fs("Normal", 0), new com.tencent.mm.ui.chatting.viewitems.fs("Markdown", 1)};
        f203999d = fsVarArr;
        rz5.b.a(fsVarArr);
    }

    public fs(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.chatting.viewitems.fs valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.chatting.viewitems.fs) java.lang.Enum.valueOf(com.tencent.mm.ui.chatting.viewitems.fs.class, str);
    }

    public static com.tencent.mm.ui.chatting.viewitems.fs[] values() {
        return (com.tencent.mm.ui.chatting.viewitems.fs[]) f203999d.clone();
    }
}

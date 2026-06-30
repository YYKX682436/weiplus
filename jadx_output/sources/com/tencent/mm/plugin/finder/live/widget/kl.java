package com.tencent.mm.plugin.finder.live.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kl {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.kl f118844d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.kl f118845e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.kl[] f118846f;

    static {
        com.tencent.mm.plugin.finder.live.widget.kl klVar = new com.tencent.mm.plugin.finder.live.widget.kl("UP", 0);
        f118844d = klVar;
        com.tencent.mm.plugin.finder.live.widget.kl klVar2 = new com.tencent.mm.plugin.finder.live.widget.kl("DOWN", 1);
        f118845e = klVar2;
        com.tencent.mm.plugin.finder.live.widget.kl[] klVarArr = {klVar, klVar2, new com.tencent.mm.plugin.finder.live.widget.kl("LEFT", 2), new com.tencent.mm.plugin.finder.live.widget.kl("RIGHT", 3)};
        f118846f = klVarArr;
        rz5.b.a(klVarArr);
    }

    public kl(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.widget.kl valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.widget.kl) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.widget.kl.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.widget.kl[] values() {
        return (com.tencent.mm.plugin.finder.live.widget.kl[]) f118846f.clone();
    }
}

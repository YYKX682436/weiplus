package com.tencent.wechat.aff.emoticon;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wechat.aff.emoticon.g f216640d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wechat.aff.emoticon.g f216641e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.wechat.aff.emoticon.g[] f216642f;

    static {
        com.tencent.wechat.aff.emoticon.g gVar = new com.tencent.wechat.aff.emoticon.g("SUCCESS", 0);
        f216640d = gVar;
        com.tencent.wechat.aff.emoticon.g gVar2 = new com.tencent.wechat.aff.emoticon.g("FAILURE", 1);
        f216641e = gVar2;
        com.tencent.wechat.aff.emoticon.g[] gVarArr = {gVar, gVar2};
        f216642f = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static com.tencent.wechat.aff.emoticon.g valueOf(java.lang.String str) {
        return (com.tencent.wechat.aff.emoticon.g) java.lang.Enum.valueOf(com.tencent.wechat.aff.emoticon.g.class, str);
    }

    public static com.tencent.wechat.aff.emoticon.g[] values() {
        return (com.tencent.wechat.aff.emoticon.g[]) f216642f.clone();
    }
}

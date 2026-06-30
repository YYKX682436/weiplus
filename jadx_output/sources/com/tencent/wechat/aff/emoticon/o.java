package com.tencent.wechat.aff.emoticon;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.wechat.aff.emoticon.o f216657d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.wechat.aff.emoticon.o f216658e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.wechat.aff.emoticon.o[] f216659f;

    static {
        com.tencent.wechat.aff.emoticon.o oVar = new com.tencent.wechat.aff.emoticon.o("SUCCESS", 0);
        f216657d = oVar;
        com.tencent.wechat.aff.emoticon.o oVar2 = new com.tencent.wechat.aff.emoticon.o("FAILURE", 1);
        f216658e = oVar2;
        com.tencent.wechat.aff.emoticon.o[] oVarArr = {oVar, oVar2};
        f216659f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static com.tencent.wechat.aff.emoticon.o valueOf(java.lang.String str) {
        return (com.tencent.wechat.aff.emoticon.o) java.lang.Enum.valueOf(com.tencent.wechat.aff.emoticon.o.class, str);
    }

    public static com.tencent.wechat.aff.emoticon.o[] values() {
        return (com.tencent.wechat.aff.emoticon.o[]) f216659f.clone();
    }
}

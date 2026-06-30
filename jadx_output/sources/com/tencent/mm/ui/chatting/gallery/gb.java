package com.tencent.mm.ui.chatting.gallery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gb {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.gb f200965d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.gb f200966e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.gb f200967f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.ui.chatting.gallery.gb[] f200968g;

    static {
        com.tencent.mm.ui.chatting.gallery.gb gbVar = new com.tencent.mm.ui.chatting.gallery.gb("EXPIRED", 0);
        f200965d = gbVar;
        com.tencent.mm.ui.chatting.gallery.gb gbVar2 = new com.tencent.mm.ui.chatting.gallery.gb("NOT_DOWNLOADED", 1);
        f200966e = gbVar2;
        com.tencent.mm.ui.chatting.gallery.gb gbVar3 = new com.tencent.mm.ui.chatting.gallery.gb("DOWNLOADED", 2);
        f200967f = gbVar3;
        com.tencent.mm.ui.chatting.gallery.gb[] gbVarArr = {gbVar, gbVar2, gbVar3};
        f200968g = gbVarArr;
        rz5.b.a(gbVarArr);
    }

    public gb(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.ui.chatting.gallery.gb valueOf(java.lang.String str) {
        return (com.tencent.mm.ui.chatting.gallery.gb) java.lang.Enum.valueOf(com.tencent.mm.ui.chatting.gallery.gb.class, str);
    }

    public static com.tencent.mm.ui.chatting.gallery.gb[] values() {
        return (com.tencent.mm.ui.chatting.gallery.gb[]) f200968g.clone();
    }
}

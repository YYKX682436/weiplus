package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public final class w8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f207231a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f207232b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f207233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f207234d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f207235e;

    public w8(java.lang.String contactUserName, java.lang.String displayNickName, boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        z18 = (i17 & 8) != 0 ? false : z18;
        z19 = (i17 & 16) != 0 ? false : z19;
        kotlin.jvm.internal.o.g(contactUserName, "contactUserName");
        kotlin.jvm.internal.o.g(displayNickName, "displayNickName");
        this.f207231a = contactUserName;
        this.f207232b = displayNickName;
        this.f207233c = z17;
        this.f207234d = z18;
        this.f207235e = z19;
    }
}

package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class er implements com.tencent.mm.pluginsdk.ui.chat.l5 {
    public long A;
    public int B;
    public java.lang.String C;
    public android.os.Bundle D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public android.os.Bundle f203904J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public int N;
    public int O;
    public java.lang.String P;
    public java.lang.String Q;

    /* renamed from: a, reason: collision with root package name */
    public rd5.d f203905a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f203906b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f203907c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.adapter.q f203908d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f203909e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f203910f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f203911g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f203912h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f203913i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f203914j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f203915k;

    /* renamed from: l, reason: collision with root package name */
    public final int f203916l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f203917m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f203918n;

    /* renamed from: o, reason: collision with root package name */
    public int f203919o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f203920p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f203921q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f203922r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f203923s;

    /* renamed from: t, reason: collision with root package name */
    public int f203924t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f203925u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f203926v;

    /* renamed from: w, reason: collision with root package name */
    public ot0.q f203927w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f203928x;

    /* renamed from: y, reason: collision with root package name */
    public int f203929y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f203930z;

    public er() {
        this.f203929y = 0;
        this.E = -1;
    }

    public static com.tencent.mm.ui.chatting.viewitems.er a(java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er();
        erVar.f203926v = str;
        return erVar;
    }

    public static com.tencent.mm.storage.f9 b(com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar) {
        try {
            return ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).getItem(qVar.getAdapterPosition());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ItemDataTag", th6, "getCurrentMsg2 err", new java.lang.Object[0]);
            return null;
        }
    }

    public com.tencent.mm.storage.f9 c() {
        rd5.d dVar = this.f203905a;
        if (dVar == null) {
            return null;
        }
        return dVar.f394254d.f445300b;
    }

    public int d() {
        com.tencent.mm.ui.chatting.adapter.q qVar = this.f203908d;
        if (qVar != null) {
            return qVar.getAdapterPosition();
        }
        return 0;
    }

    public er(rd5.d dVar, boolean z17, com.tencent.mm.ui.chatting.adapter.q qVar, java.lang.String str, boolean z18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f203929y = 0;
        this.E = -1;
        this.f203905a = dVar;
        this.f203907c = z17;
        this.f203908d = qVar;
        this.f203906b = str;
        this.f203910f = str3;
        this.f203911g = str4;
        this.f203912h = str5;
        this.f203916l = i17;
        this.f203917m = str6;
        this.f203918n = str7;
        this.f203926v = str8;
    }

    public er(rd5.d dVar, boolean z17, com.tencent.mm.ui.chatting.adapter.q qVar, java.lang.String str, boolean z18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z19, boolean z27) {
        this.f203929y = 0;
        this.E = -1;
        this.f203905a = dVar;
        this.f203907c = z17;
        this.f203908d = qVar;
        this.f203906b = str;
        this.f203910f = str3;
        this.f203911g = str4;
        this.f203912h = str5;
        this.f203913i = str6;
        this.f203926v = str7;
        this.f203914j = z19;
        this.f203915k = z27;
    }

    public er(rd5.d dVar, boolean z17, com.tencent.mm.ui.chatting.adapter.q qVar, java.lang.String str, boolean z18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(dVar, z17, qVar, str, z18, str2, str3, str4, str5, (java.lang.String) null, (java.lang.String) null, false, false);
    }

    public er(rd5.d dVar, boolean z17, com.tencent.mm.ui.chatting.adapter.q qVar, java.lang.String str, boolean z18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this(dVar, z17, qVar, str, z18, str2, str3, str4, null);
    }

    public er(rd5.d dVar, boolean z17, com.tencent.mm.ui.chatting.adapter.q qVar, java.lang.String str, boolean z18) {
        this(dVar, z17, qVar, str, z18, null, null, null);
    }

    public er(rd5.d dVar, boolean z17, com.tencent.mm.ui.chatting.adapter.q qVar, java.lang.String str) {
        this(dVar, z17, qVar, str, false);
    }

    public er(rd5.d dVar, java.lang.String str) {
        this(str);
        this.f203905a = dVar;
    }

    public er(java.lang.String str) {
        this.f203929y = 0;
        this.E = -1;
        this.f203906b = str;
    }

    public er(java.lang.String str, java.lang.String str2) {
        this.f203929y = 0;
        this.E = -1;
        this.f203906b = str;
        this.f203909e = str2;
    }

    public er(rd5.d dVar, java.lang.String str, java.lang.String str2) {
        this.f203929y = 0;
        this.E = -1;
        this.f203906b = str;
        this.f203905a = dVar;
        this.C = str2;
    }
}

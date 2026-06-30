package if4;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final nf4.j f291243a;

    /* renamed from: b, reason: collision with root package name */
    public final if4.g f291244b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f291245c;

    /* renamed from: d, reason: collision with root package name */
    public final long f291246d;

    /* renamed from: e, reason: collision with root package name */
    public final if4.h f291247e;

    /* renamed from: f, reason: collision with root package name */
    public final if4.a f291248f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f291249g;

    public f(nf4.j story, r45.lf6 storyTImeline, if4.g storyItemScene) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        boolean z17;
        nf4.b bVar;
        int i17;
        java.lang.String str;
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(story, "story");
        kotlin.jvm.internal.o.g(storyTImeline, "storyTImeline");
        kotlin.jvm.internal.o.g(storyItemScene, "storyItemScene");
        this.f291243a = story;
        this.f291244b = storyItemScene;
        this.f291245c = "MicroMsg.StoryGalleryItem";
        long j17 = story.field_storyID;
        this.f291246d = j17;
        int i27 = (int) story.systemRowid;
        int i28 = story.field_createTime;
        java.lang.String str2 = story.field_userName;
        java.lang.String str3 = "";
        if4.h hVar = new if4.h(i27, j17, i28, str2 == null ? "" : str2);
        if (storyTImeline.f379432h.f382205e.size() > 0) {
            java.lang.Object obj = storyTImeline.f379432h.f382205e.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            hVar.f291258f = (r45.xe6) obj;
        }
        this.f291247e = hVar;
        this.f291248f = new if4.a();
        r45.df6 df6Var = new r45.df6();
        try {
            df6Var.parseFrom(story.field_attrBuf);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String str4 = story.field_userName;
        str4 = str4 == null ? ef4.w.f252468t.e() : str4;
        if4.a aVar = this.f291248f;
        aVar.getClass();
        aVar.f291233a = str4;
        aVar.f291234b = story.field_storyID;
        aVar.f291235c = 0;
        story.w0();
        nf4.b z07 = ef4.w.f252468t.f().z0(story.field_storyID);
        boolean z18 = z07 == null || z07.field_readCommentTime == 0;
        java.util.Iterator it = df6Var.f372390n.iterator();
        boolean z19 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList = aVar.f291240h;
            linkedList2 = aVar.f291239g;
            if (!hasNext) {
                break;
            }
            r45.ke6 ke6Var = (r45.ke6) it.next();
            kotlin.jvm.internal.o.d(ke6Var);
            gf4.a aVar2 = new gf4.a(ke6Var);
            if (z07 != null && (i19 = z07.field_readCommentTime) > 0 && aVar2.f271332c > i19) {
                if (!com.tencent.mm.sdk.platformtools.t8.D0(aVar2.f271330a, ef4.w.f252468t.e())) {
                    aVar2.f271335f = true;
                    z19 = true;
                }
            }
            linkedList2.add(aVar2);
            linkedList.add(aVar2);
            java.lang.String str5 = aVar.f291233a;
            kotlin.jvm.internal.o.g(str5, "<set-?>");
            aVar2.f271340k = str5;
            story.z0();
        }
        java.util.Iterator it6 = df6Var.f372392p.iterator();
        boolean z27 = false;
        while (true) {
            boolean hasNext2 = it6.hasNext();
            linkedList3 = aVar.f291241i;
            if (!hasNext2) {
                break;
            }
            r45.ke6 ke6Var2 = (r45.ke6) it6.next();
            java.util.Iterator it7 = it6;
            kotlin.jvm.internal.o.d(ke6Var2);
            gf4.a aVar3 = new gf4.a(ke6Var2);
            if (z07 == null || (i18 = z07.field_readCommentTime) <= 0) {
                str = str3;
            } else {
                str = str3;
                if (aVar3.f271332c > i18) {
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(aVar3.f271330a, ef4.w.f252468t.e())) {
                        aVar3.f271335f = true;
                        z27 = true;
                    }
                }
            }
            linkedList2.add(aVar3);
            linkedList3.add(aVar3);
            java.lang.String str6 = aVar.f291233a;
            kotlin.jvm.internal.o.g(str6, "<set-?>");
            aVar3.f271340k = str6;
            story.z0();
            it6 = it7;
            str3 = str;
        }
        java.lang.String str7 = str3;
        java.util.Iterator it8 = df6Var.f372402z.iterator();
        boolean z28 = false;
        while (true) {
            boolean hasNext3 = it8.hasNext();
            linkedList4 = aVar.f291242j;
            if (!hasNext3) {
                break;
            }
            r45.ke6 ke6Var3 = (r45.ke6) it8.next();
            java.util.Iterator it9 = it8;
            kotlin.jvm.internal.o.d(ke6Var3);
            gf4.a aVar4 = new gf4.a(ke6Var3);
            if (z07 == null || (i17 = z07.field_readCommentTime) <= 0) {
                bVar = z07;
            } else {
                bVar = z07;
                if (aVar4.f271332c > i17) {
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(aVar4.f271330a, ef4.w.f252468t.e())) {
                        aVar4.f271335f = true;
                        z28 = true;
                    }
                }
            }
            linkedList4.add(aVar4);
            java.lang.String str8 = aVar.f291233a;
            kotlin.jvm.internal.o.g(str8, "<set-?>");
            aVar4.f271340k = str8;
            story.z0();
            it8 = it9;
            z07 = bVar;
        }
        if (linkedList2.size() > 1) {
            kz5.g0.t(linkedList2, new if4.b());
        }
        if (linkedList.size() > 1) {
            kz5.g0.t(linkedList, new if4.c());
        }
        if (linkedList3.size() > 1) {
            kz5.g0.t(linkedList3, new if4.d());
        }
        if (linkedList4.size() > 1) {
            kz5.g0.t(linkedList4, new if4.e());
        }
        if (!z18 || linkedList2.size() <= 0) {
            z17 = false;
        } else {
            gf4.l lVar = gf4.l.f271354d;
            java.lang.Object obj2 = linkedList2.get(0);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            gf4.a aVar5 = (gf4.a) obj2;
            ef4.v vVar = ef4.w.f252468t;
            nf4.a f17 = vVar.f();
            long j18 = this.f291246d;
            nf4.b z08 = f17.z0(j18);
            if (z08 == null) {
                z08 = new nf4.b();
                z08.field_storyId = j18;
            }
            z08.field_readCommentId = aVar5.f271334e;
            z08.field_readCommentTime = aVar5.f271332c;
            z17 = false;
            vVar.f().update(z08, new java.lang.String[0]);
        }
        aVar.f291236d = (z27 || z19) ? true : z17;
        aVar.f291237e = z28;
        aVar.f291238f = z19;
        java.lang.String str9 = story.field_userName;
        this.f291249g = str9;
        ef4.k0 k0Var = ef4.k0.f252459a;
        if4.h hVar2 = this.f291247e;
        if (!((com.tencent.mm.vfs.w6.j(k0Var.c(hVar2.f291258f, str9 == null ? str7 : str9)) || com.tencent.mm.vfs.w6.j(k0Var.d(hVar2.f291258f))) ? true : z17)) {
            java.lang.String str10 = hVar2.f291258f.A;
            if (!((str10 == null || str10.length() == 0) ? true : z17)) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(this.f291245c, "LogStory: " + this);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof if4.f)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if4.f fVar = (if4.f) obj;
        return this.f291246d == fVar.f291246d && kotlin.jvm.internal.o.b(this.f291247e, fVar.f291247e) && kotlin.jvm.internal.o.b(this.f291248f, fVar.f291248f) && this.f291243a.v0().f391018e == fVar.f291243a.v0().f391018e;
    }

    public java.lang.String toString() {
        return "StoryGalleryItem(videoItem=" + this.f291247e + ", comment=" + this.f291248f + ')';
    }

    public /* synthetic */ f(nf4.j jVar, r45.lf6 lf6Var, if4.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        this(jVar, lf6Var, (i17 & 4) != 0 ? if4.g.f291250d : gVar);
    }
}

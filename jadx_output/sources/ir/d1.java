package ir;

/* loaded from: classes12.dex */
public final class d1 extends ir.a {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.LinkedList f293826g = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f293827d;

    /* renamed from: e, reason: collision with root package name */
    public final int f293828e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f293829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ir.t groupInfo, boolean z17) {
        super(groupInfo);
        boolean contains;
        boolean z18;
        kotlin.jvm.internal.o.g(groupInfo, "groupInfo");
        if (!c()) {
            this.f293827d = new java.util.ArrayList();
            this.f293813c.add(new ir.f0(groupInfo.f293900b));
            return;
        }
        if (z17) {
            this.f293827d = new java.util.ArrayList();
        } else {
            java.util.ArrayList f17 = gr.t.g().f(groupInfo.f293900b.field_productID);
            this.f293827d = f17;
            com.tencent.mars.xlog.Log.i("MicroMsg.PanelItemGroup", "StoreItemGroup: " + groupInfo.c() + " count: " + f17.size() + '[' + groupInfo.f293900b.field_count + ']');
            int size = f17.size();
            int i17 = groupInfo.f293900b.field_count;
            if (size != i17 && i17 > 0) {
                java.lang.String c17 = groupInfo.c();
                int i18 = groupInfo.f293900b.field_count;
                java.util.LinkedList linkedList = f293826g;
                synchronized (linkedList) {
                    contains = linkedList.contains(c17);
                }
                if (!contains) {
                    com.tencent.mm.autogen.mmdata.rpt.EmoticonRepairInfoStruct emoticonRepairInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.EmoticonRepairInfoStruct();
                    emoticonRepairInfoStruct.f56067f = i18;
                    emoticonRepairInfoStruct.f56068g = f17.size();
                    emoticonRepairInfoStruct.f56065d = emoticonRepairInfoStruct.b("ProductId", c17, true);
                    synchronized (linkedList) {
                        linkedList.add(c17);
                    }
                    r45.se3 se3Var = new r45.se3();
                    z85.s y07 = com.tencent.mm.storage.n5.f().d().y0(c17);
                    if ((y07 != null ? y07.field_content : null) != null) {
                        try {
                            se3Var.parseFrom(y07.field_content);
                            r45.qj0 qj0Var = se3Var.f385652d;
                            if ((qj0Var != null ? qj0Var.f384050y : null) == null || qj0Var.f384050y.size() != i18) {
                                z18 = false;
                            } else {
                                java.util.LinkedList<r45.m35> ThumbExtList = se3Var.f385652d.f384050y;
                                kotlin.jvm.internal.o.f(ThumbExtList, "ThumbExtList");
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(ThumbExtList, 10));
                                for (r45.m35 m35Var : ThumbExtList) {
                                    kotlin.jvm.internal.o.d(m35Var);
                                    com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(m35Var.f380117f);
                                    if (u17 == null) {
                                        com.tencent.mars.xlog.Log.w("MicroMsg.PanelItemGroup", "repair emoji create " + m35Var.f380117f);
                                        u17 = new com.tencent.mm.storage.emotion.EmojiInfo();
                                        u17.field_md5 = m35Var.f380117f;
                                        u17.field_thumbUrl = m35Var.f380120i;
                                        u17.field_cdnUrl = m35Var.f380119h;
                                        u17.field_aeskey = m35Var.f380118g;
                                        u17.field_encrypturl = m35Var.f380121m;
                                        u17.field_externUrl = m35Var.f380122n;
                                        u17.field_externMd5 = m35Var.f380123o;
                                        u17.field_activityid = m35Var.f380124p;
                                        u17.field_groupId = c17;
                                    } else if (!kotlin.jvm.internal.o.b(u17.field_groupId, c17)) {
                                        com.tencent.mars.xlog.Log.w("MicroMsg.PanelItemGroup", "repair emoji " + u17.getMd5() + " from [" + u17.field_groupId + "] to [" + c17 + ']');
                                        u17.field_groupId = c17;
                                    }
                                    arrayList.add(u17);
                                }
                                z18 = f17.size() != arrayList.size();
                                com.tencent.mm.storage.n5.f().c().h2(arrayList, c17);
                            }
                            if (z18) {
                                gr.t.g().f274691j.remove(c17);
                                java.util.ArrayList f18 = gr.t.g().f(c17);
                                if (!f18.isEmpty()) {
                                    this.f293827d.clear();
                                    this.f293827d.addAll(f18);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.PanelItemGroup", "StoreItemGroup: " + this.f293811a.c() + " repair count: " + this.f293827d.size());
                                }
                            }
                            emoticonRepairInfoStruct.f56069h = this.f293827d.size();
                            emoticonRepairInfoStruct.k();
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.PanelItemGroup", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                        }
                    } else {
                        emoticonRepairInfoStruct.f56066e = 1;
                        emoticonRepairInfoStruct.k();
                    }
                }
            }
            r45.v75 c18 = gr.t.g().c(groupInfo.f293900b.field_productID);
            if (c18 != null) {
                ir.i0 i0Var = this.f293812b;
                i0Var.f293867c = c18;
                if (((com.tencent.mm.feature.emoji.api.m6) i95.n0.c(com.tencent.mm.feature.emoji.api.m6.class)) != null) {
                    y12.p.f458877a.b(c18.f387964d, false, new ir.h0(i0Var));
                }
                this.f293812b.f293868d = com.tencent.mm.storage.d5.f193836a.a(c18.f387964d).a();
                this.f293829f = this.f293812b.f293868d;
            }
            this.f293813c.add(this.f293812b);
        }
        this.f293828e = this.f293827d.size();
        java.util.Iterator it = this.f293827d.iterator();
        while (it.hasNext()) {
            this.f293813c.add(new ir.g((com.tencent.mm.storage.emotion.EmojiInfo) it.next(), 2, null, 0, 12, null));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f293828e;
    }

    public final boolean c() {
        ir.r rVar = this.f293811a;
        kotlin.jvm.internal.o.e(rVar, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiPanelGroupItemGroup");
        return ((ir.t) rVar).f293900b.field_sync == 2 || com.tencent.mm.sdk.platformtools.t8.D0(((ir.t) rVar).f293900b.field_productID, "17");
    }
}

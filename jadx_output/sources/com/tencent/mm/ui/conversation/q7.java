package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class q7 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public boolean f208021o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.y7 f208022p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.b4 f208023q;

    /* renamed from: r, reason: collision with root package name */
    public final hb5.m f208024r;

    /* renamed from: s, reason: collision with root package name */
    public final android.database.DataSetObserver f208025s;

    public q7(android.content.Context context, java.lang.String str, com.tencent.mm.ui.y9 y9Var) {
        super(context, new com.tencent.mm.ui.conversation.p7());
        this.f208021o = false;
        com.tencent.mm.ui.conversation.m7 m7Var = new com.tencent.mm.ui.conversation.m7(this);
        this.f208025s = m7Var;
        r(false);
        com.tencent.mm.ui.conversation.b4 b4Var = new com.tencent.mm.ui.conversation.b4(context, str, y9Var);
        this.f208023q = b4Var;
        b4Var.registerDataSetObserver(m7Var);
        java.lang.String d17 = r01.q3.cj().d1(str);
        hb5.m mVar = new hb5.m(context, y9Var, com.tencent.mm.sdk.platformtools.t8.K0(d17) ? str : d17);
        this.f208024r = mVar;
        mVar.registerDataSetObserver(m7Var);
        r01.q3.aj().add(mVar);
        r01.q3.aj().f401872e.a(mVar, mVar.f280221o.getMainLooper());
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s01.b bVar;
        com.tencent.mm.ui.conversation.p7 p7Var = (com.tencent.mm.ui.conversation.p7) obj;
        if (p7Var == null) {
            p7Var = new com.tencent.mm.ui.conversation.p7();
        }
        p7Var.f207964b = this.f208022p.f().getPosition();
        try {
            p7Var.f207965c = null;
            hb5.m mVar = this.f208024r;
            bVar = p7Var.f207966d;
            if (bVar == null) {
                mVar.getClass();
                bVar = new s01.b();
                mVar.C = bVar.field_bizChatId;
            }
            bVar.field_bizChatId = mVar.C;
            bVar.convertFrom(cursor);
            p7Var.f207966d = bVar;
        } catch (java.lang.Throwable unused) {
            p7Var.f207966d = null;
        }
        if (bVar.field_bizChatId > 0) {
            p7Var.f207963a = 0;
            return p7Var;
        }
        p7Var.f207966d = null;
        try {
            com.tencent.mm.ui.conversation.b4 b4Var = this.f208023q;
            com.tencent.mm.storage.l4 l4Var = p7Var.f207965c;
            b4Var.getClass();
            if (l4Var == null) {
                l4Var = new com.tencent.mm.storage.l4();
            }
            l4Var.o1("");
            l4Var.p1("");
            l4Var.convertFrom(cursor);
            p7Var.f207965c = l4Var;
            p7Var.f207963a = 1;
        } catch (java.lang.Throwable unused2) {
            p7Var.f207965c = null;
        }
        return p7Var;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        com.tencent.mm.ui.conversation.y7 y7Var = this.f208022p;
        return y7Var != null ? y7Var.getCount() : super.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.tencent.mm.ui.conversation.p7 item = getItem(i17);
        if (item == null) {
            return 0;
        }
        return item.f207963a;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.conversation.p7 item = getItem(i17);
        int i18 = item.f207963a;
        int i19 = 1;
        while (i18 != 1) {
            try {
                if (i18 == 0) {
                    return this.f208024r.getView(item.f207964b, view, viewGroup);
                }
            } catch (java.lang.ClassCastException unused) {
                if (view != null) {
                    view = null;
                }
            }
            int i27 = i19 - 1;
            if (i19 <= 0) {
                return null;
            }
            i19 = i27;
        }
        return this.f208023q.getView(item.f207964b, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        if (this.f208021o) {
            com.tencent.mm.ui.conversation.y7 y7Var = new com.tencent.mm.ui.conversation.y7(com.tencent.mm.ui.conversation.x7.ASC, new com.tencent.mm.ui.conversation.s7());
            this.f208022p = y7Var;
            s(y7Var);
        } else {
            this.f208021o = true;
            q();
            this.f208021o = false;
        }
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        this.f208023q.q();
        this.f208024r.q();
        com.tencent.mm.ui.conversation.y7 y7Var = new com.tencent.mm.ui.conversation.y7(com.tencent.mm.ui.conversation.x7.DESC, new com.tencent.mm.ui.conversation.n7(this), new com.tencent.mm.ui.conversation.o7(this));
        this.f208022p = y7Var;
        s(y7Var);
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.ui.conversation.p7 getItem(int i17) {
        hb5.m mVar = this.f208024r;
        com.tencent.mm.ui.conversation.b4 b4Var = this.f208023q;
        com.tencent.mm.ui.conversation.p7 p7Var = (com.tencent.mm.ui.conversation.p7) super.getItem(i17);
        if (p7Var != null) {
            return p7Var;
        }
        try {
            int count = b4Var.getCount();
            int count2 = mVar.getCount();
            com.tencent.mm.ui.conversation.y7 y7Var = this.f208022p;
            com.tencent.mars.xlog.Log.w("MergeBizChatConversationAdapter", "getItem NULL, position=%d, size=%d, cursor.size=[%d, %d], window=[%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()), java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(count2), java.lang.Integer.valueOf(this.f208022p.f208270m), java.lang.Integer.valueOf(y7Var.f208270m + y7Var.f208271n.size()));
            if (count > 0 && i17 < count) {
                com.tencent.mm.ui.conversation.p7 p7Var2 = new com.tencent.mm.ui.conversation.p7();
                try {
                    p7Var2.f207963a = 1;
                    int max = java.lang.Math.max(0, i17);
                    p7Var2.f207964b = max;
                    p7Var2.f207965c = (com.tencent.mm.storage.l4) b4Var.getItem(max);
                    p7Var = p7Var2;
                } catch (java.lang.Throwable unused) {
                    return p7Var2;
                }
            }
            int i18 = i17 - count;
            if (p7Var != null || count2 <= 0 || i18 >= count2) {
                return p7Var;
            }
            com.tencent.mm.ui.conversation.p7 p7Var3 = new com.tencent.mm.ui.conversation.p7();
            try {
                p7Var3.f207963a = 0;
                int max2 = java.lang.Math.max(0, i18);
                p7Var3.f207964b = max2;
                p7Var3.f207966d = (s01.b) mVar.getItem(max2);
            } catch (java.lang.Throwable unused2) {
            }
            return p7Var3;
        } catch (java.lang.Throwable unused3) {
            return p7Var;
        }
    }
}

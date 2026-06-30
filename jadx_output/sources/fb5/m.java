package fb5;

/* loaded from: classes9.dex */
public class m extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f260894d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f260895e;

    /* renamed from: f, reason: collision with root package name */
    public final fb5.l f260896f;

    public m(fb5.l lVar) {
        this.f260894d = null;
        if (lVar == null) {
            throw new java.lang.RuntimeException("ViewCreator can not be null.");
        }
        this.f260896f = lVar;
        this.f260894d = new java.util.ArrayList();
        this.f260895e = new java.util.HashMap();
    }

    public final void a(java.util.List list) {
        java.lang.String str;
        java.util.List list2 = this.f260894d;
        if (list2 != list) {
            ((java.util.ArrayList) list2).clear();
            if (list != null) {
                ((java.util.ArrayList) list2).addAll(list);
            }
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f260895e;
        hashMap.clear();
        int i17 = 0;
        java.lang.String str2 = null;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list2;
            if (i17 >= arrayList.size()) {
                notifyDataSetChanged();
                return;
            }
            fb5.n nVar = (fb5.n) arrayList.get(i17);
            if (nVar == null || (str = nVar.f260897a) == null) {
                str = null;
            }
            if (str != null && !str.equalsIgnoreCase(str2)) {
                hashMap.put(str, java.lang.Integer.valueOf(i17));
                str2 = str;
            }
            i17++;
        }
    }

    public void c(java.util.List list) {
        if (java.lang.Thread.currentThread().getId() != android.os.Looper.getMainLooper().getThread().getId()) {
            com.tencent.mm.sdk.platformtools.u3.h(new fb5.k(this, list));
        } else {
            a(list);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f260894d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f260894d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.getItem(r10)
            r2 = r0
            fb5.n r2 = (fb5.n) r2
            java.util.List r0 = r9.f260894d
            r1 = 0
            if (r10 < 0) goto L1f
            r3 = r0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            if (r10 < r4) goto L16
            goto L1f
        L16:
            java.lang.Object r3 = r3.get(r10)
            fb5.n r3 = (fb5.n) r3
            java.lang.String r3 = r3.f260897a
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r10 + 1
            if (r4 < 0) goto L35
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r5 = r0.size()
            if (r4 < r5) goto L2d
            goto L35
        L2d:
            java.lang.Object r0 = r0.get(r4)
            fb5.n r0 = (fb5.n) r0
            java.lang.String r1 = r0.f260897a
        L35:
            java.util.Map r0 = r9.f260895e
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4 = -1
            int r0 = com.tencent.mm.sdk.platformtools.t8.j1(r0, r4)
            r4 = 1
            r5 = 0
            if (r10 != r0) goto L4a
            r7 = r4
            goto L4b
        L4a:
            r7 = r5
        L4b:
            if (r3 == 0) goto L55
            boolean r0 = r3.equalsIgnoreCase(r1)
            if (r0 != 0) goto L55
            r8 = r4
            goto L56
        L55:
            r8 = r5
        L56:
            fb5.l r1 = r9.f260896f
            int r6 = r9.getCount()
            r3 = r11
            r4 = r12
            r5 = r10
            android.view.View r10 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fb5.m.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}

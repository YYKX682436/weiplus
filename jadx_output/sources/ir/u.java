package ir;

/* loaded from: classes12.dex */
public final class u extends ir.r {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiIPSetInfo f293904b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f293905c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f293906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.storage.emotion.EmojiIPSetInfo info) {
        super(4);
        kotlin.jvm.internal.o.g(info, "info");
        this.f293904b = info;
        this.f293905c = new java.util.LinkedList();
    }

    @Override // ir.r
    public boolean a(java.lang.String groupId) {
        boolean z17;
        kotlin.jvm.internal.o.g(groupId, "groupId");
        if (super.a(groupId)) {
            return true;
        }
        java.util.LinkedList linkedList = this.f293905c;
        if (!(linkedList instanceof java.util.Collection) || !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.storage.emotion.EmojiGroupInfo) it.next()).field_productID, groupId)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // ir.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = super.b(r8)
            r1 = 0
            if (r0 == 0) goto L64
            boolean r0 = r8 instanceof ir.u
            if (r0 == 0) goto L64
            ir.u r8 = (ir.u) r8
            java.util.LinkedList r8 = r8.f293905c
            java.util.LinkedList r0 = r7.f293905c
            java.lang.String r2 = "newList"
            kotlin.jvm.internal.o.g(r8, r2)
            java.lang.String r2 = "oldList"
            kotlin.jvm.internal.o.g(r0, r2)
            int r2 = r8.size()
            int r3 = r0.size()
            r4 = 1
            if (r2 == r3) goto L2a
        L28:
            r8 = r1
            goto L61
        L2a:
            java.util.Iterator r8 = r8.iterator()
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L60
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r8.next()
            com.tencent.mm.storage.emotion.EmojiGroupInfo r2 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r2
            java.lang.Object r3 = r0.next()
            com.tencent.mm.storage.emotion.EmojiGroupInfo r3 = (com.tencent.mm.storage.emotion.EmojiGroupInfo) r3
            java.lang.String r5 = r2.field_productID
            java.lang.String r6 = r3.field_productID
            boolean r5 = kotlin.jvm.internal.o.b(r5, r6)
            if (r5 == 0) goto L5c
            int r2 = r2.field_idx
            int r3 = r3.field_idx
            if (r2 != r3) goto L5c
            r2 = r4
            goto L5d
        L5c:
            r2 = r1
        L5d:
            if (r2 != 0) goto L32
            goto L28
        L60:
            r8 = r4
        L61:
            if (r8 == 0) goto L64
            r1 = r4
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.u.b(java.lang.Object):boolean");
    }

    @Override // ir.r
    public java.lang.String c() {
        java.lang.String field_key = this.f293904b.field_key;
        kotlin.jvm.internal.o.f(field_key, "field_key");
        return field_key;
    }

    @Override // ir.r
    public java.lang.String d() {
        java.lang.String str = this.f293904b.field_panelUrl;
        return str == null ? "" : str;
    }

    @Override // ir.r
    public java.lang.String e() {
        java.lang.String str = this.f293904b.field_title;
        return str == null ? "" : str;
    }
}

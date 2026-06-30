package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/MentionEllipsizeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Ldm/pd;", "finderMention", "Ljz5/f0;", "setMention", "g", "Ldm/pd;", "getFinderMention", "()Ldm/pd;", "setFinderMention", "(Ldm/pd;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MentionEllipsizeTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public dm.pd finderMention;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionEllipsizeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final dm.pd getFinderMention() {
        return this.finderMention;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            super.onMeasure(r17, r18)
            dm.pd r1 = r0.finderMention
            android.text.Layout r2 = r16.getLayout()
            if (r1 == 0) goto Lb8
            if (r2 == 0) goto Lb8
            r45.oy0 r3 = r1.field_commentMentionedUser
            if (r3 == 0) goto Lb8
            int r3 = r2.getLineCount()
            int r3 = r3 + (-1)
            int r2 = r2.getEllipsisCount(r3)
            if (r2 <= 0) goto Lb8
            r45.oy0 r2 = r1.field_commentMentionedUser
            java.lang.String r3 = "field_commentMentionedUser"
            kotlin.jvm.internal.o.f(r2, r3)
            r3 = 0
            com.tencent.mm.protobuf.g r4 = r2.getByteString(r3)
            if (r4 == 0) goto L6e
            com.tencent.mm.protobuf.g r4 = r2.getByteString(r3)
            kotlin.jvm.internal.o.d(r4)
            byte[] r4 = r4.f192156a
            int r4 = r4.length
            r5 = 16
            if (r4 == r5) goto L3c
            goto L6e
        L3c:
            com.tencent.mm.protobuf.g r2 = r2.getByteString(r3)
            kotlin.jvm.internal.o.d(r2)
            byte[] r2 = r2.f192156a
            kotlin.jvm.internal.o.d(r2)
            r4 = 8
            byte[] r6 = kz5.v.q(r2, r3, r4)
            com.tencent.qqmusic.mediaplayer.util.BytesTransUtil r7 = com.tencent.qqmusic.mediaplayer.util.BytesTransUtil.getInstance()
            long r11 = r7.getLong(r6, r3)
            byte[] r2 = kz5.v.q(r2, r4, r5)
            com.tencent.qqmusic.mediaplayer.util.BytesTransUtil r4 = com.tencent.qqmusic.mediaplayer.util.BytesTransUtil.getInstance()
            long r13 = r4.getLong(r2, r3)
            com.tencent.mm.plugin.finder.view.rr r2 = new com.tencent.mm.plugin.finder.view.rr
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            r15 = 1
            r8 = r2
            r8.<init>(r9, r10, r11, r13, r15)
            goto L6f
        L6e:
            r2 = 0
        L6f:
            if (r2 != 0) goto L72
            goto Lb8
        L72:
            java.lang.String r1 = r1.field_content
            long r2 = r2.f132984c
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L9d
            int r4 = r1.length()
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L9d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "…"
            r4.<init>(r5)
            int r2 = (int) r2
            int r3 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L9d:
            java.lang.Class<le0.x> r2 = le0.x.class
            i95.m r2 = i95.n0.c(r2)
            le0.x r2 = (le0.x) r2
            android.content.Context r3 = r16.getContext()
            ke0.e r2 = (ke0.e) r2
            r2.getClass()
            android.text.SpannableString r1 = com.tencent.mm.pluginsdk.ui.span.c0.i(r3, r1)
            r0.setText(r1)
            super.onMeasure(r17, r18)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.MentionEllipsizeTextView.onMeasure(int, int):void");
    }

    public final void setFinderMention(dm.pd pdVar) {
        this.finderMention = pdVar;
    }

    public final void setMention(dm.pd pdVar) {
        this.finderMention = pdVar;
        if (pdVar != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.cpu, pdVar.field_content);
            ((ke0.e) xVar).getClass();
            setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MentionEllipsizeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}

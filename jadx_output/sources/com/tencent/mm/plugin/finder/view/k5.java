package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class k5 implements nl5.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentEditText f132479a;

    public k5(com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText) {
        this.f132479a = finderCommentEditText;
    }

    @Override // nl5.u
    public void a(android.text.Editable editable, java.lang.CharSequence charSequence, int i17, int i18) {
        if (charSequence == null || editable == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText = this.f132479a;
        if (finderCommentEditText.getPastedList().get(java.lang.Long.valueOf(finderCommentEditText.getFeedId())) == null) {
            finderCommentEditText.getPastedList().put(java.lang.Long.valueOf(finderCommentEditText.getFeedId()), new java.util.LinkedList<>());
        }
        java.util.LinkedList<java.lang.String> linkedList = finderCommentEditText.getPastedList().get(java.lang.Long.valueOf(finderCommentEditText.getFeedId()));
        if (linkedList != null) {
            linkedList.add(charSequence.toString());
        }
    }
}

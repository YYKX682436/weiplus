package com.tencent.mm.ui.widget.listview;

/* loaded from: classes15.dex */
public class AnimatedExpandableListView extends android.widget.ExpandableListView {

    /* renamed from: d, reason: collision with root package name */
    public ql5.d f212143d;

    public AnimatedExpandableListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAnimationDuration() {
        return 150;
    }

    public boolean c(int i17) {
        int flatListPosition = getFlatListPosition(android.widget.ExpandableListView.getPackedPositionForGroup(i17));
        if (flatListPosition != -1) {
            int firstVisiblePosition = flatListPosition - getFirstVisiblePosition();
            if (firstVisiblePosition < 0 || firstVisiblePosition >= getChildCount()) {
                return collapseGroup(i17);
            }
            if (getChildAt(firstVisiblePosition).getBottom() >= getBottom()) {
                return collapseGroup(i17);
            }
        }
        long expandableListPosition = getExpandableListPosition(getFirstVisiblePosition());
        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(expandableListPosition);
        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(expandableListPosition);
        if (packedPositionChild == -1 || packedPositionGroup != i17) {
            packedPositionChild = 0;
        }
        ql5.d dVar = this.f212143d;
        int i18 = ql5.d.f364595c;
        ql5.g a17 = dVar.a(i17);
        a17.f364606a = true;
        a17.f364608c = packedPositionChild;
        a17.f364607b = false;
        this.f212143d.notifyDataSetChanged();
        return isGroupExpanded(i17);
    }

    public boolean d(int i17) {
        int firstVisiblePosition;
        int flatListPosition = getFlatListPosition(android.widget.ExpandableListView.getPackedPositionForGroup(i17));
        if (flatListPosition != -1 && (firstVisiblePosition = flatListPosition - getFirstVisiblePosition()) < getChildCount() && getChildAt(firstVisiblePosition).getBottom() >= getBottom()) {
            this.f212143d.a(i17).f364609d = -1;
            return expandGroup(i17);
        }
        ql5.d dVar = this.f212143d;
        int i18 = ql5.d.f364595c;
        ql5.g a17 = dVar.a(i17);
        a17.f364606a = true;
        a17.f364608c = 0;
        a17.f364607b = true;
        return expandGroup(i17);
    }

    @Override // android.widget.ExpandableListView
    public void setAdapter(android.widget.ExpandableListAdapter expandableListAdapter) {
        super.setAdapter(expandableListAdapter);
        if (expandableListAdapter instanceof ql5.d) {
            ql5.d dVar = (ql5.d) expandableListAdapter;
            this.f212143d = dVar;
            dVar.f364597b = this;
        } else {
            throw new java.lang.ClassCastException(expandableListAdapter.toString() + " must implement AnimatedExpandableListAdapter");
        }
    }

    public AnimatedExpandableListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}

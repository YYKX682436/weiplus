package ii1;

/* loaded from: classes7.dex */
public class e implements android.widget.RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f291616a;

    public e(android.content.Context context) {
        this.f291616a = context;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        java.util.List list = hi1.o.f281500c.f281501a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public android.widget.RemoteViews getLoadingView() {
        return new android.widget.RemoteViews(this.f291616a.getPackageName(), com.tencent.mm.R.layout.f488122hr);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public android.widget.RemoteViews getViewAt(int i17) {
        hi1.o oVar = hi1.o.f281500c;
        java.util.List list = oVar.f281501a;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return null;
        }
        hi1.m mVar = (hi1.m) oVar.f281501a.get(i17);
        android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.f291616a.getPackageName(), com.tencent.mm.R.layout.f488122hr);
        remoteViews.setTextViewText(com.tencent.mm.R.id.pmf, mVar.f281497b);
        remoteViews.setImageViewBitmap(com.tencent.mm.R.id.pme, oVar.f281502b[i17]);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_item", mVar.f281496a);
        intent.putExtra("extra_action", "action_click_item");
        remoteViews.setOnClickFillInIntent(com.tencent.mm.R.id.pme, intent);
        remoteViews.setOnClickFillInIntent(com.tencent.mm.R.id.pmf, intent);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("extra_action", "action_click_bg");
        remoteViews.setOnClickFillInIntent(com.tencent.mm.R.id.pmd, intent2);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onCreate");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onDataSetChanged");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOuterWidget", "onDestroy");
        hi1.o oVar = hi1.o.f281500c;
        if (oVar.f281501a != null) {
            oVar.f281501a = null;
        }
    }
}

package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class u3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f141786d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameIndexListView f141787e;

    public u3(com.tencent.mm.plugin.game.ui.GameIndexListView gameIndexListView) {
        this.f141787e = gameIndexListView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f141786d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.plugin.game.model.c) this.f141786d.get(i17)).f140235a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.game.ui.t3 t3Var = (com.tencent.mm.plugin.game.ui.t3) k3Var;
        com.tencent.mm.plugin.game.model.c cVar = (com.tencent.mm.plugin.game.model.c) this.f141786d.get(i17);
        if (cVar == null) {
            return;
        }
        int i18 = cVar.f140235a;
        if (i18 == 2000) {
            ((com.tencent.mm.plugin.game.ui.GameFeedModuleTitle) t3Var.f141763d).setData(cVar);
            return;
        }
        switch (i18) {
            case 1:
                ((com.tencent.mm.plugin.game.ui.GameFeedImageTextView) t3Var.f141763d).setData(cVar);
                return;
            case 2:
                ((com.tencent.mm.plugin.game.ui.GameFeedVideoView) t3Var.f141763d).setVideoData(cVar);
                return;
            case 3:
                ((com.tencent.mm.plugin.game.ui.GameFeedVideoView) t3Var.f141763d).setLiveData(cVar);
                return;
            case 4:
                ((com.tencent.mm.plugin.game.ui.GameFeedMatchView) t3Var.f141763d).setData(cVar);
                return;
            case 5:
                ((com.tencent.mm.plugin.game.ui.GameFeedGameTemplateView) t3Var.f141763d).setData(cVar);
                return;
            case 6:
                ((com.tencent.mm.plugin.game.ui.GameFeedNoGamePlayTemplate) t3Var.f141763d).setData(cVar);
                return;
            default:
                switch (i18) {
                    case 8:
                        ((com.tencent.mm.plugin.game.ui.GameFeedAddTopicView) t3Var.f141763d).setData(cVar);
                        return;
                    case 9:
                        ((com.tencent.mm.plugin.game.ui.GameFeedMoreGameEntranceView) t3Var.f141763d).setData(cVar);
                        return;
                    case 10:
                        ((com.tencent.mm.plugin.game.ui.GameFeedQipaiView) t3Var.f141763d).setData(cVar);
                        return;
                    default:
                        switch (i18) {
                            case 1000:
                                ((com.tencent.mm.plugin.game.ui.GameBestSellingTitle) t3Var.f141763d).setText(cVar.f140238d.f324194r.f323893e);
                                return;
                            case 1001:
                                ((com.tencent.mm.plugin.game.ui.GameBestSellingItemView) t3Var.f141763d).setData(cVar);
                                return;
                            case 1002:
                                ((com.tencent.mm.plugin.game.ui.GameBestSellingMore) t3Var.f141763d).setData(cVar);
                                return;
                            default:
                                return;
                        }
                }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate;
        com.tencent.mm.plugin.game.ui.GameIndexListView gameIndexListView = this.f141787e;
        if (i17 != 2000) {
            switch (i17) {
                case 1:
                    inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.bfu, viewGroup, false);
                    break;
                case 2:
                case 3:
                    inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.f489148bg3, viewGroup, false);
                    break;
                case 4:
                    inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.bfw, viewGroup, false);
                    break;
                case 5:
                    inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.bft, viewGroup, false);
                    break;
                case 6:
                    inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.bfz, viewGroup, false);
                    break;
                default:
                    switch (i17) {
                        case 8:
                            inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.bfs, viewGroup, false);
                            break;
                        case 9:
                            inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.bfy, viewGroup, false);
                            break;
                        case 10:
                            inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.f489145bg0, viewGroup, false);
                            break;
                        default:
                            switch (i17) {
                                case 1000:
                                    inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.f489135be2, viewGroup, false);
                                    break;
                                case 1001:
                                    inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.f489133be0, viewGroup, false);
                                    break;
                                case 1002:
                                    inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.f489134be1, viewGroup, false);
                                    break;
                                default:
                                    inflate = new android.widget.FrameLayout(gameIndexListView.getContext());
                                    break;
                            }
                    }
            }
        } else {
            inflate = android.view.LayoutInflater.from(gameIndexListView.f140855i2).inflate(com.tencent.mm.R.layout.bfx, viewGroup, false);
        }
        return new com.tencent.mm.plugin.game.ui.t3(this, inflate);
    }
}
